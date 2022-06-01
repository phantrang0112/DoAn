package com.Trang.webyte.controller;

import com.Trang.webyte.config.PaypalPaymentIntent;
import com.Trang.webyte.config.PaypalPaymentMethod;
import com.Trang.webyte.service.service_impl.PaypalService;
import com.Trang.webyte.util.PaypalUtil;
import com.paypal.api.payments.Links;
import com.paypal.api.payments.Payment;
import com.paypal.base.rest.PayPalRESTException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/pay")
public class PaymentController {
  private Logger log = LoggerFactory.getLogger(getClass());
  @Autowired
  private PaypalService paypalService;
  @GetMapping("/")
  public String index(){
    return "index";
  }
  @PostMapping("")
  public Map<String,Object> pay(@RequestBody() double price  ){
    System.out.println(price);
    Map<String,Object> linkPayment=new HashMap<>();
    String cancelUrl ="http://localhost:4200/#/user/payment";
    String successUrl = "http://localhost:4200/#/user/payment" ;
    try {
      Payment payment = paypalService.createPayment(
              price,
              "USD",
              PaypalPaymentMethod.paypal,
              PaypalPaymentIntent.sale,
              "payment description",
              cancelUrl,
              successUrl
             );
      for(Links links : payment.getLinks()){
        if("approval_url".equals(links.getRel())){
          linkPayment.put("linkPayment",links.getHref());
          return linkPayment;
        }
      }
    } catch (PayPalRESTException e) {
      log.error(e.getMessage());
    }
    return null;
  }
  @GetMapping("/cancel")
  public String cancelPay(){
    return "cancel";
  }
  @GetMapping("/success")
  public Map<String,Object> successPay(@RequestParam("paymentId") String paymentId, @RequestParam("PayerID") String payerId){
    Map<String,Object> success=new HashMap<>();
    try {

      Payment payment = paypalService.executePayment(paymentId, payerId);
      if(payment.getState().equals("approved")){
        success.put("success","success");
        return success;
      }
      success.put("success","error");
    } catch (PayPalRESTException e) {
      log.error(e.getMessage());
    }
    return success;
  }
}

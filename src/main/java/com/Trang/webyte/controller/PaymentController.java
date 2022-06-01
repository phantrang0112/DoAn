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

@CrossOrigin
@RestController
public class PaymentController {
  private Logger log = LoggerFactory.getLogger(getClass());
  @Autowired
  private PaypalService paypalService;
  @GetMapping("/")
  public String index(){
    return "index";
  }
  @PostMapping("/pay")
  public String pay(@RequestBody() double price , HttpServletRequest request ){
    String cancelUrl = PaypalUtil.getBaseURL(request) + "/cancel" ;
    String successUrl = "http://localhost:4200/#/user/about" ;
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
          return links.getHref();
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
  public String successPay(@RequestParam("paymentId") String paymentId, @RequestParam("PayerID") String payerId){
    try {
      Payment payment = paypalService.executePayment(paymentId, payerId);
      if(payment.getState().equals("approved")){
        return "success";
      }
    } catch (PayPalRESTException e) {
      log.error(e.getMessage());
    }
    return "error";
  }
}

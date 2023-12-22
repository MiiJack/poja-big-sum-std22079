package com.std22079.bigsum.endpoint.bigsum;

import com.std22079.bigsum.service.event.BigSumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BigSumController {
  private final BigSumService bigSumService;

  @Autowired
  public BigSumController(BigSumService bigSumService) {
    this.bigSumService = bigSumService;
  }

  @GetMapping("/big-sum")
  public String bigSum(@RequestParam("a") String a, @RequestParam("b") String b) {
    return bigSumService.bigSum(a, b).toString();
  }
}

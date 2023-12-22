package com.std22079.bigsum.service.event;

import java.math.BigInteger;
import org.springframework.stereotype.Service;

@Service
public class BigSumService {
  public BigInteger bigSum(String a, String b) {
    BigInteger numA = new BigInteger(a);
    BigInteger numB = new BigInteger(b);
    return numA.add(numB);
  }
}

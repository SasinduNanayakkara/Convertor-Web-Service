package org.sas50.convertorwebservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface DecimalToBinary {

    @WebMethod
    String decimalToBinary(int decimal);
}

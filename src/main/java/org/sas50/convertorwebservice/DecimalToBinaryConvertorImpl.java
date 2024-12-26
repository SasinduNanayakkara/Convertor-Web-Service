package org.sas50.convertorwebservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public class DecimalToBinaryConvertorImpl implements DecimalToBinary{

    @WebMethod
    public String decimalToBinary(@WebParam() int decimal) {
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int temp = decimal % 2;
            binary.insert(0, temp); // Append binary digit to the front
            decimal = decimal / 2;
        }
        return binary.toString();
    }
}

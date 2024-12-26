package org.sas50.convertorwebservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public class BinaryToDecimalConvertorImpl implements BinaryToDecimal {

    @WebMethod
    public int binaryToDecimal(@WebParam(name = "binary") String binary) {
        int decimal = 0;
        int power = 0;

        // Iterate over the binary string from the last character to the first
        for (int i = binary.length() - 1; i >= 0; i--) {
            char bit = binary.charAt(i);
            if (bit == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        return decimal;
    }
}

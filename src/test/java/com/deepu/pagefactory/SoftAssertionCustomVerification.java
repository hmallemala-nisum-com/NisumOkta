package com.deepu.pagefactory;

import junit.framework.Assert;

public class SoftAssertionCustomVerification {

    private  StringBuffer verificationErrors;

    public SoftAssertionCustomVerification(){
        verificationErrors = new StringBuffer();
    }

    public  void verifyTrue(String msg, Boolean b){
        try {
            Assert.assertTrue(b.booleanValue());
        } catch(Error e){
            appendFailureMessages(verificationErrors,msg);
        }
    }

    public  void verifyFalse(String msg, Boolean b){
        try {
            Assert.assertTrue(b.booleanValue());
        } catch(Error e){
            appendFailureMessages(verificationErrors,msg);
        }
    }

    private void appendFailureMessages(StringBuffer verificationErrors,String failureMessage){
        if(verificationErrors==null){
            verificationErrors = new StringBuffer();
        }
        verificationErrors.append(failureMessage);
        verificationErrors.append(System.getProperty("line.separator"));
    }

    private void clearVerificationErrors(){
        verificationErrors = new StringBuffer();
    }

    public void checkForVerificationErrors(){
        String verificationErrorString = verificationErrors.toString();
        clearVerificationErrors();
        Assert.assertEquals("",verificationErrorString);
    }
}
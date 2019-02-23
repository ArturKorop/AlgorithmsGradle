package com.korartur.TechDevGuide;

import org.junit.Assert;
import org.junit.Test;

public class EncriptionFuncTest {
    @Test
    public void test1() {
        var e = new EncryptionFunc();

        Assert.assertTrue(e.isOk("foo","haa"));
        Assert.assertFalse(e.isOk("foo","bar"));
        Assert.assertFalse(e.isOk("fa","tt"));
        Assert.assertFalse(e.isOk("foo","aba"));
        Assert.assertTrue(e.isOk("tratratq","hlohlohs"));
        Assert.assertFalse(e.isOk("tratratq","hlohloho"));
    }


    @Test
    public void should_return_true_both_strings_equal_reverseMap() {
        String plainText = "foo";
        String encryptedText = "foo";
        Assert.assertTrue(new EncryptionFunc().isOk(plainText, encryptedText));
    }
    @Test
    public void should_return_true_valid_encryption_1_reverseMap() {
        String plainText = "foo";
        String encryptedText = "juu";
        Assert.assertTrue(new EncryptionFunc().isOk(plainText, encryptedText));
    }
    @Test
    public void should_return_true_valid_encryption_2_reverseMap() {
        String plainText = "juu";
        String encryptedText = "foo";
        Assert.assertTrue(new EncryptionFunc().isOk(plainText, encryptedText));
    }

    @Test
    public void should_return_false_null_input_1_reverseMap() {
        String plainText = null;
        String encryptedText = "foo";
        Assert.assertFalse(new EncryptionFunc().isOk(plainText, encryptedText));
    }
    @Test
    public void should_return_false_null_input_2_reverseMap() {
        String plainText = "foo";
        String encryptedText = null;
        Assert.assertFalse(new EncryptionFunc().isOk(plainText, encryptedText));
    }
    @Test
    public void should_return_false_diff_input_lengths_reverseMap() {
        String plainText = "foo";
        String encryptedText = "booh";
        Assert.assertFalse(new EncryptionFunc().isOk(plainText, encryptedText));
    }
    @Test
    public void should_return_false_not_one_to_one_encryption_1_reverseMap() {
        String plainText = "foo";
        String encryptedText = "bar";
        Assert.assertFalse(new EncryptionFunc().isOk(plainText, encryptedText));
    }
    @Test
    public void should_return_false_not_one_to_one_encryption_2_reverseMap() {
        String plainText = "bar";
        String encryptedText = "foo";
        Assert.assertFalse(new EncryptionFunc().isOk(plainText, encryptedText));
    }

}

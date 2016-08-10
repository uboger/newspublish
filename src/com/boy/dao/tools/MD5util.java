package com.boy.dao.tools;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.sun.mail.imap.protocol.BASE64MailboxDecoder;
import com.sun.mail.imap.protocol.BASE64MailboxEncoder;
import com.sun.mail.util.BASE64EncoderStream;

public class MD5util {
	public static String getMessage(String msg){
		try {
			MessageDigest md5  = MessageDigest.getInstance("md5");
			byte[] sources = msg.getBytes();
			sources = md5.digest(sources);
			return new String(BASE64EncoderStream.encode(sources));
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException();
		}
	}
}

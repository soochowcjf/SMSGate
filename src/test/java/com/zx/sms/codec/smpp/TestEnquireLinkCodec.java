package com.zx.sms.codec.smpp;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.junit.Assert;
import org.junit.Test;

import com.zx.sms.codec.AbstractSMPPTestMessageCodec;
import com.zx.sms.codec.smpp.msg.EnquireLink;

public class TestEnquireLinkCodec extends AbstractSMPPTestMessageCodec<EnquireLink> {

	@Test
	public void test() throws DecoderException{
		ByteBuf buffer = Unpooled.wrappedBuffer(Hex.decodeHex("0000001000000015000000000a342e".toCharArray()));
		EnquireLink msg = decode(buffer);
		 Assert.assertNull(msg);
		 
		 EnquireLink a = new EnquireLink();
		 ByteBuf b = encode(a);
		 Assert.assertEquals(16, b.readableBytes());
	}
	
	
}

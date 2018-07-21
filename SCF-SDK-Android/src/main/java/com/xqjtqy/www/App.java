package com.xqjtqy.www;

import com.xqjtqy.www.scf.v20180416.ScfClient;
import com.xqjtqy.www.scf.v20180416.models.InvokeRequest;
import com.xqjtqy.www.scf.v20180416.models.InvokeResponse;
import com.xqjtqy.www.common.Credential;
import com.xqjtqy.www.common.exception.TencentCloudSDKException;

public class App 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Credential cre = new Credential("Appid","Secrectid");
			ScfClient client = new ScfClient(cre, "region");
			InvokeRequest inrq = new InvokeRequest();
			inrq.setFunctionName("Hello");
			inrq.setLogType("Tail");
			InvokeResponse inrs = client.Invoke(inrq);
			System.out.println(InvokeResponse.toJsonString(inrs));
		}
		catch (TencentCloudSDKException e) {
            System.out.println(e.toString());
		}
	}
}

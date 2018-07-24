package com.test.tencentapi.scf;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.scf.v20180416.ScfClient;
import com.tencentcloudapi.scf.v20180416.models.InvokeRequest;
import com.tencentcloudapi.scf.v20180416.models.InvokeResponse;

public class MainApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Credential cre = new Credential("AKIDIOEo8Dddy3sDKCxFOO9gy2rXyA7qeceQ","f5F9oDQO8dtviGafU3MPBk7E5h271f29");
			ScfClient client = new ScfClient(cre, "ap-guangzhou");
			InvokeRequest inrq = new InvokeRequest();
			inrq.setFunctionName("Hello");
			inrq.setLogType("Tail");
			InvokeResponse inrs = client.Invoke(inrq);
			System.out.println(InvokeResponse.toJsonString(inrs).replaceAll("\\\\u0027", "\"").replaceAll("\\\\\"", "\""));
		}
		catch (TencentCloudSDKException e) {
            System.out.println(e.toString());
		}
	}

}

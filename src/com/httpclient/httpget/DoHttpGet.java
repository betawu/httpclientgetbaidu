package com.httpclient.httpget;

import java.io.IOException;
import java.net.URI;

import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpEntity;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;

/**
 * 
 * @author beta
 *
 *通过httpclient抓取百度首页
 */
public class DoHttpGet implements HttpUriRequest{
	
	
	public void httpGet45(){
		//新建httpclient对象
		CloseableHttpClient client = HttpClients.createDefault();
		//创建请求实体
		String uri = "http://www.baidu.com";
		HttpGet httpGet = new HttpGet(uri);
		//设置请求参数（无）
		//执行请求
		CloseableHttpResponse response = null;
		try {
			response = client.execute(httpGet);
			
			//处理返回结果
			System.out.println("打印http版本信息"+response.getProtocolVersion());
			System.out.println("打印状态信息"+response.getStatusLine().toString());
			System.out.println("打印状态码"+response.getStatusLine().getReasonPhrase());
			
			HttpEntity entity = response.getEntity();
			if(entity!=null) {
				String charset = "utf-8";
				System.out.println(EntityUtils.toString(entity,charset));
			}
			
			//销毁实体 
			
			
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//关闭连接
			try {
				response.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	

	@Override
	public RequestLine getRequestLine() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addHeader(Header arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addHeader(String arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean containsHeader(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Header[] getAllHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Header getFirstHeader(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Header[] getHeaders(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Header getLastHeader(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpParams getParams() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProtocolVersion getProtocolVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HeaderIterator headerIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HeaderIterator headerIterator(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeHeader(Header arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeHeaders(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setHeader(Header arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setHeader(String arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setHeaders(Header[] arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setParams(HttpParams arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abort() throws UnsupportedOperationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getMethod() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public URI getURI() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAborted() {
		// TODO Auto-generated method stub
		return false;
	}
	
}

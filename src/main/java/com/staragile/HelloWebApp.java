package com.staragile;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWebApp extends HttpServlet {

	private static final long serialVersionUID = 1L;

        protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
	         throws ServletException, IOException {
        	
        	PrintWriter out = resp.getWriter();
        	resp.setContentType("text/html");
        	
        	out.println("<html>");
		out.println("<body bgcolor=\"#A9A9A9\">");
		
        	//out.println("<body bgcolor=\"Green\">");
        	out.println("<h1>Hello from Staragile</h1>");
        	
        	out.println("<h3>Demo Java Project for Staragile DevOps certification Jul-2020 from Prashant Beniwal</h3>");
        	
		out.println("<div style="background-image: url('https://in.images.search.yahoo.com/images/view;_ylt=AwrwS20FaS1fOmkAJiIO9olQ;_ylu=X3oDMTIyNzA2Zjg2BHNlYwNzcgRzbGsDaW1nBG9pZAM4ZjdjNjAwZDg4ZGMxZjBkYWE0MTkwNzA0NjU4MDA1NQRncG9zAzEEaXQDYmluZw--?back=https%3A%2F%2Fin.images.search.yahoo.com%2Fyhs%2Fsearch%3Fp%3Ddevops%2Bimages%26fr%3Dyhs-iry-fullyhosted_003%26h%3D1080%26hsimp%3Dyhs-fullyhosted_003%26hspart%3Diry%26tt%3DDevOps%2Band%2Bits%2BImpact%2Bon%2BInformation%2BTechnology%2B%2528IT%2529%26w%3D1920%26imgurl%3Dhttp%253A%252F%252Fwww.rapidvaluesolutions.com%252Fwp-content%252Fuploads%252F2017%252F05%252FDevOps.png%26rurl%3Dhttp%253A%252F%252Fwww.rapidvaluesolutions.com%252Fdevops-and-its-impact-on-information-technology-it%252F%26turl%3Dhttps%253A%252F%252Ftse1.mm.bing.net%252Fth%253Fid%253DOIP.aJDy59jq23gMux0yJg7nggHaEK%2526amp%253Bpid%253DApi%2526rs%253D1%2526c%253D1%2526qlt%253D95%2526w%253D170%2526h%253D95%26tw%3D170.9%26th%3D95.9%26sigr%3DjGQ3LhDgomqo%26sigi%3DDFbHMVIeRPx1%26sigt%3DRsp0DCMaW92m%26sigit%3DhaAk5rMGbmz2%26tab%3Dorganic%26ri%3D1&w=1920&h=1080&imgurl=www.rapidvaluesolutions.com%2Fwp-content%2Fuploads%2F2017%2F05%2FDevOps.png&rurl=http%3A%2F%2Fwww.rapidvaluesolutions.com%2Fdevops-and-its-impact-on-information-technology-it%2F&size=588.4KB&p=devops+images&oid=8f7c600d88dc1f0daa41907046580055&fr2=&fr=yhs-iry-fullyhosted_003&tt=DevOps+and+its+Impact+on+Information+Technology+%28IT%29&b=0&ni=108&no=1&ts=&tab=organic&sigr=jGQ3LhDgomqo&sigb=x1WAnyZWdjAx&sigi=DFbHMVIeRPx1&sigt=Rsp0DCMaW92m&.crumb=izA01iHUUmQ&fr=yhs-iry-fullyhosted_003&hsimp=yhs-fullyhosted_003&hspart=iry')"> + </div>");
        	out.println("<p>A Random Number v1 : <strong>" + Math.random() + "</strong></p>");
           	out.println("<P>Max Number v1 : <strong>" +Math.max(5,8) + "</strong></p>");
	       	out.println("<P>Min Number v1 : <strong>" +Math.min(5,8) + "</strong></p> ");
		out.println("<P>Squareroot v1 : <strong>" +Math.sqrt(5) + "</strong></p> ");
 
        	out.println("</body>");
        	out.println("</html>");   
        
        }


        public int add(int a, int b) {
            return a + b ;
        }

	public int sub(int a, int b) {
            return a - b;
        }
	public int mul(int a, int b) {
            return a * b ;
        }
}

package com.boy.dao.tools;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class RandomImageServerlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			response.setHeader("pragma", "no-cache");
			response.setHeader("cache-control" , "no-cache");
			response.setHeader("expires", "no-cache");
			Random r = new Random();
			BufferedImage img = new BufferedImage(70, 20, BufferedImage.TYPE_INT_RGB);
			for(int x=0;x<img.getWidth();x++){
				for(int y=0;y<img.getHeight();y++){
					int a = r.nextInt(0xff);
					Color c = new Color(a,a,a);
					int rgb = c.getRGB();
					img.setRGB(x, y, rgb);
				}
			}
			char[] chs = new char[62];
			int i=-1;
			for(char ch =48;ch<123;ch++){
				if(ch==58)ch=65;
				if(ch==91)ch=97;
				chs[++i]=ch;
			}
			
			char[] rchs ={chs[r.nextInt(62)],chs[r.nextInt(62)],chs[r.nextInt(62)],chs[r.nextInt(62)]};
			String no = new String(rchs);
			String no1 = MD5util.getMessage(no);
			request.getSession().setAttribute("randomcode", no1);
			
			Graphics2D g2 = img.createGraphics();
			
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			Font font = new Font("", Font.PLAIN, 20);
			g2.setFont(font);
			for(int j=0;j<rchs.length;j++){
				g2.setColor(new Color(r.nextInt(0xff), r.nextInt(0xff), r.nextInt(0xff)));
				g2.drawString(String.valueOf(rchs[j]), j*16+6, r.nextInt(4)+14);
			}
			ImageIO.write(img, "png", response.getOutputStream());
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}

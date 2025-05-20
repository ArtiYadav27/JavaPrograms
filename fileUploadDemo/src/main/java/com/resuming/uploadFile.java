package com.resuming;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class uploadFile extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletFileUpload sf=new ServletFileUpload(new DiskFileItemFactory());
		try {
			List<FileItem> multipleFiles= sf.parseRequest(request);
			for(FileItem item:multipleFiles) {
				item.write(new File("D:\\Eclips-workspace\\fileUploadDemo/"+item.getName() ));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("file uploaded");
	}

}

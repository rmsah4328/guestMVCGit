package com.java.guest.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.command.CommandAction;
import com.java.guest.dao.GuestDao;
import com.java.guest.dto.GuestDto;

public class GuestWriteAction implements CommandAction {

	@Override
	public String actionDo(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		
		
		ArrayList<GuestDto> guestList=GuestDao.gestInstance().getGuestList();
		
		if(guestList !=null) {
			System.out.println(guestList.size());
			request.setAttribute("guestList", guestList);
		}

		return "/WEB-INF/views/guest/write.jsp";
	}
}

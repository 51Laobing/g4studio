package org.g4studio.common.util;

import org.frameworkset.security.session.SessionEvent;
import org.frameworkset.security.session.SessionListener;

public class BBossSessionListener  implements SessionListener{
	private org.g4studio.common.util.SessionListener sessionListener = new org.g4studio.common.util.SessionListener();
	public BBossSessionListener() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addAttribute(SessionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createSession(SessionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroySession(SessionEvent arg0) {
		sessionListener.sessionDestroyed(arg0);
		
	}

	@Override
	public void removeAttribute(SessionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

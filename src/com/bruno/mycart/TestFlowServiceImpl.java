package com.bruno.mycart;

import org.springframework.stereotype.Service;

@Service("testFlowService")
public class TestFlowServiceImpl implements TestFlowService {
	
	private String value1;
	
	/* (non-Javadoc)
	 * @see com.bruno.mycart.TestFlowService#getValue1()
	 */
	@Override
	public String getValue1() {
		return value1;
	}
	
	/* (non-Javadoc)
	 * @see com.bruno.mycart.TestFlowService#setValue1(java.lang.String)
	 */
	@Override
	public void setValue1(String value1) {
		this.value1 = value1;
	}

}

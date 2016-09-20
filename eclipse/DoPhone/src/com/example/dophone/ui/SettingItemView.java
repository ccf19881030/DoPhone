package com.example.dophone.ui;


import com.example.dophone.R;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;


/**
 * �����Զ������Ͽؼ���������������TextView ������һ��CheckBox,����һ��View
 * @author Administrator
 *
 */
public class SettingItemView extends RelativeLayout {
	private CheckBox cb_status;
	private TextView tv_desc;
	private TextView tv_title;
	
	private  String desc_on;
	private String desc_off;
	
	/**
	 * ��ʼ�������ļ�
	 * @param context
	 */
	private void iniView(Context context) {
		
		//��һ�������ļ�---��View ���Ҽ�����SettingItemView
		View.inflate(context, R.layout.set_item_view, this);
		cb_status = (CheckBox) this.findViewById(R.id.cb_status);
		tv_desc = (TextView) this.findViewById(R.id.tv_desc);
		tv_title = (TextView) this.findViewById(R.id.tv_title);
		
	}

	public SettingItemView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		iniView(context);
	}
	/**
	 * �������������Ĺ��췽���������ļ�ʹ�õ�ʱ�����
	 * @param context
	 * @param attrs
	 */

	public SettingItemView(Context context, AttributeSet attrs) {
		super(context, attrs);
		iniView(context);
		String title = attrs.getAttributeValue("http://schemas.android.com/apk/res/com.example.dophone", "title");
		desc_on = attrs.getAttributeValue("http://schemas.android.com/apk/res/com.example.dophone", "desc_on");
		desc_off = attrs.getAttributeValue("http://schemas.android.com/apk/res/com.example.dophone", "desc_off");
		tv_title.setText(title);
		setDesc(desc_off);
	}

	

	public SettingItemView(Context context) {
		super(context);
		iniView(context);
	}
	
	/**
	 * У����Ͽؼ��Ƿ�ѡ��
	 */
	
	public boolean isChecked(){
		return cb_status.isChecked();
	}
	
	/**
	 * ������Ͽؼ���״̬
	 */
	
	public void setChecked(boolean checked){
		if(checked){
			setDesc(desc_on);
		}else{
			setDesc(desc_off);
		}
		cb_status.setChecked(checked);
	}
	
	/**
	 * ���� ��Ͽؼ���������Ϣ
	 */
	
	public void setDesc(String text){
		tv_desc.setText(text);
	}
	
	

}

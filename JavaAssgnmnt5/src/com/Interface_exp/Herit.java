package com.Interface_exp;

import com.Inter_e.Second;


public class Herit implements Second{

	int id = 12;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Herit h1 = new Herit();
		
		h1.main();
		h1.few();
		h1.Start();
		
		System.out.println("The Final value of id and name a "+h1.id+" "+Newinter.b);

	}

	@Override
	public void few() {
		// TODO Auto-generated method stub
		System.out.println("The final few words "+id+" "+Newinter.b);
		
	}

	@Override
	public void Start() {
		// TODO Auto-generated method stub

		System.out.println("The Start is here");
	}

	@Override
	public void main() {
		
		System.out.println("The value of b with id "+id+" "+Newinter.b);
		
		// TODO Auto-generated method stub
		
	}

}

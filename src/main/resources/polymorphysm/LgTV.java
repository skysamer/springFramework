package polymorphysm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
	
	@Autowired
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("===> LgTV 객체 생성");
	}

	@Override
	public void powerOn() {
		System.out.println("lg on");
		
	}

	@Override
	public void powerOff() {
		System.out.println("lg off");		
	}

	@Override
	public void volumeUp() {
		speaker.volumeUp();	
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();	
	}

}

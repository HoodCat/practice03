package tv;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	public void power(boolean power) {
		this.power = power;
	}
	public void channel( int channel ) {
		plzOnTV();
		if ( channel > 255 || channel < 1) {
//			System.out.println("System : 잘 못된 채널입니다.");
			this.channel = 255;
			return;
		}
		this.channel = channel;
	}
	
	public void channel(boolean up) {
		plzOnTV();
		if(up) {
			channel = (channel + 255) % 255 + 1;
		} else {
			channel = (channel - 2 + 255) % 255 + 1;
		}
	}
	public void volume(int volume) {
		plzOnTV();
		if(volume > 100 || volume < 0) {
//			System.out.println("System : 잘 못된 범위가 입력됐습니다.");
			this.volume = 100;
			return ;
		}
		
		this.volume = volume;
	}
	public void volume(boolean up) {
		plzOnTV();
		if(up) {
			this.volume = (volume + 1 + 100)%100;
		} else {
			this. volume = (volume - 1 + 100)%100;
		}
	}
	public void status() {
		System.out.println(
				String.format("TV[channel=%d, volume=%d, power=%b]",
						channel, volume, power));
	}
	
	private void plzOnTV() {
		if(!isPower()) {
			System.out.println("System : 전원을 키고 조작해주세요");
			return;
		}
	}
}

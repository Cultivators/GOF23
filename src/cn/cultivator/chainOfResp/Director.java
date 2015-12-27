package cn.cultivator.chainOfResp;

public class Director extends Leader{

	public Director(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest lr) {
		if(lr.getDay()<3){
			System.out.println("�����:"+lr.getName()+",�������:"+lr.getDay()+",���ԭ��"+lr.getReason());
			System.out.println("����:"+this.name+",���ͨ��.");
		}else{
			if(this.nextLeader!=null){
				this.nextLeader.handleRequest(lr);
			}
		}
	}

}

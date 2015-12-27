package cn.cultivator.chainOfResp;

public class Manager extends Leader{

	public Manager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest lr) {
		if(lr.getDay()<10){
			System.out.println("�����:"+lr.getName()+",�������:"+lr.getDay()+",���ԭ��"+lr.getReason());
			System.out.println("����:"+this.name+",���ͨ��.");
		}else{
			if(this.nextLeader!=null){
				this.nextLeader.handleRequest(lr);
			}
		}
	}

}

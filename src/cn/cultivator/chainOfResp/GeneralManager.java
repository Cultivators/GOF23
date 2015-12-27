package cn.cultivator.chainOfResp;

public class GeneralManager extends Leader{

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest lr) {
		if(lr.getDay()<30){
			System.out.println("�����:"+lr.getName()+",�������:"+lr.getDay()+",���ԭ��"+lr.getReason());
			System.out.println("�ܾ���:"+this.name+",���ͨ��.");
		}else{
			if(this.nextLeader!=null){
				this.nextLeader.handleRequest(lr);
			}
		}
	}

}

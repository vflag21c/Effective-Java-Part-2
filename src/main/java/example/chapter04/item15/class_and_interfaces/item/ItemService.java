package example.chapter04.item15.class_and_interfaces.item;


import example.chapter04.item15.class_and_interfaces.member.MemberService;

public class ItemService {

    public static final String NAME = "You Yeol"; // 이런 case..
    public static final String[] NAMES = new String[10]; //권장하지 않음 ( 외부에서 수정 )

    private MemberService memberService;

    boolean onSale; //package-private

    protected int saleRate; // public & protected : 공개 API ( 유지관리 필요 )

    public ItemService(MemberService memberService) {
        if (memberService == null) {
            throw new IllegalArgumentException("MemberService should not be null.");
        }

        this.memberService = memberService;
    }

    MemberService getMemberService() {
        return memberService;
    }
}

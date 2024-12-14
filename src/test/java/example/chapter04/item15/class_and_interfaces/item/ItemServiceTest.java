package example.chapter04.item15.class_and_interfaces.item;

import example.chapter04.item15.class_and_interfaces.member.MemberService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

class ItemServiceTest {

//    @Mock
    MemberService memberService;

    @Test
    void itemService() {
        ItemService service = new ItemService(memberService);
        assertNotNull(service);
        assertNotNull(service.getMemberService());
    }

}
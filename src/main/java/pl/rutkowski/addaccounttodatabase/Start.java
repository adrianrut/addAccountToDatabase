package pl.rutkowski.addaccounttodatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Start {

    private UserRepo userRepo;

    @Autowired
    public Start(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
    @EventListener(ApplicationReadyEvent.class)
    public void run() {
        User user1 = new User("Suhy", "miszcz", "babochłop",Hobby.Sport);
        userRepo.save(user1);
        User user2 = new User("Chuj", "dupa", "lizodup",Hobby.Masturbacja);
        userRepo.save(user2);
        User user3 = new User("Debil", "kupa", "transtraktor",Hobby.Melanż);
        userRepo.save(user3);

    }
}

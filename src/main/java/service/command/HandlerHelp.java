package service.command;

public class HandlerHelp extends CommandHandler {
    public HandlerHelp(CommandHandler handler) {
        super(handler);
    }

    @Override
    protected void apply(String[] command) {
        System.out.println("get|user|login|user1|1234\n" +
                "get|user|user1\n" +
                "delete|user|user1\n" +
                "post|user\n" +
                "8|newUser|Inna|Khomenko|inna@gmail.com|1234|987654|8\n" +
                "9|newUser2|Inna|Khomenko|inna@gmail.com|1234|987654|8\n" +
                "10|newUser3|Inna|Khomenko|inna@gmail.com|1234|987654|8\n" +
                "post|user|createWithList\n" +
                "post|user|createWithArray\n" +
                "get|user|logout");
    }

    @Override
    protected boolean isApplicable(String[] command) {
        return "help".equals(command[0]);
    }
}

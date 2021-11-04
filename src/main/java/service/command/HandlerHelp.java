package service.command;

public class HandlerHelp extends CommandHandler {
    public HandlerHelp(CommandHandler handler) {
        super(handler);
    }

    @Override
    protected void apply(String[] command) {
        System.out.println("get|user|login|user1|1234\n" +
                "\n" +
                "get|user|user1\n" +
                "get|user|newUser\n" +
                "get|user|newUser2\n" +
                "\n" +
                "delete|user|newUser3\n" +
                "\n" +
                "post|user\n" +
                "\n" +
                "post|user|createWithList\n" +
                "\n" +
                "8|newUser|Inna|Khomenko|inna@gmail.com|1234|987654|8\n" +
                "9|newUser2|Inna|Khomenko|inna@gmail.com|1234|987654|8\n" +
                "10|newUser3|Inna|Khomenko|inna@gmail.com|1234|987654|8\n" +
                "\n" +
                "post|user|createWithArray\n" +
                "08|newUser|Inna|Khomenko|inna@gmail.com|1234|987654|8;09|newUser2|Inna|Khomenko|inna@gmail.com|1234|987654|8;10|newUser3|Inna|Khomenko|inna@gmail.com|1234|987654|8\n" +
                "\n" +
                "get|user|logout\n" +
                "\n" +
                "post|pet|image\n" +
                "\n" +
                "post|pet\n" +
                "\n" +
                "2|Kleo|AVAILABLE|cats\n" +
                "5|Ruf|AVAILABLE|ant\n" +
                "\n" +
                "put|pet\n" +
                "2|Kleo2|AVAILABLE|cats\n" +
                "\n" +
                "get|pet|findByStatus|AVAILABLE\n" +
                "get|pet|findByStatus|DELIVERED\n" +
                "get|pet|findByStatus|PLACED\n" +
                "\n" +
                "get|pet|2\n" +
                "\n" +
                "delete|pet|2\n" +
                "\n" +
                "post|order\n" +
                "\n" +
                "2|1|30|2021-09-09|PLACED|true\n" +
                "5|3|25|2021-03-11|APPROVED|true\n" +
                "\n" +
                "get|order|1\n" +
                "\n" +
                "delete|order|2");
    }

    @Override
    protected boolean isApplicable(String[] command) {
        return "help".equals(command[0]);
    }
}

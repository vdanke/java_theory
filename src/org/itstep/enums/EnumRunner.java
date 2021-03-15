package org.itstep.enums;

public class EnumRunner {

    public static void main(String[] args) {
        RoleEnum user = RoleEnum.ROLE_USER;
        RoleEnum admin = RoleEnum.ROLE_ADMIN;

        System.out.println(admin.ordinal());
        System.out.println(admin);

        System.out.println(user.ordinal());
        System.out.println(user);

        System.out.println(user.getExpiredDate());
        System.out.println(admin.getExpiredDate());

        boolean isValid = validateRoleSafety("ROLE");
        System.out.println(isValid);
    }

    public static String switchEnum(RoleEnum r) {
        switch (r) {
            case ROLE_USER -> {
                return "User";
            }
            case ROLE_ADMIN -> {
                return "Admin";
            }
            default -> {
                return "Default";
            }
        }
    }

    public static boolean validateRoleSafety(String user) {
        RoleEnum[] roles = RoleEnum.values();
        for (RoleEnum r : roles) {
            if (r.name().equalsIgnoreCase(user)) {
                return true;
            }
        }
        return false;
    }

    public static boolean validateRole(String user) {
        try {
            RoleEnum.valueOf(user);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}

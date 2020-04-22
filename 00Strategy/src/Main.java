public class Main {
    public static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacter();

        gameCharacter.Attack();

        gameCharacter.setWeapon(new Knife());
        gameCharacter.Attack();

        gameCharacter.setWeapon(new Sword());
        gameCharacter.Attack();

        gameCharacter.setWeapon(new Ax());
        gameCharacter.Attack();
    }
}

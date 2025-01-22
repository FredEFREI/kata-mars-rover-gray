package info.dmerej;

public class Rover {
    public int x;
    public int y;
    public Direction direction;

    public Rover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void moveForward(){
            switch(direction){
                case NORTH:
                    y += 1;
                    break;
                case SOUTH:
                    y -= 1;
                    break;
                case EAST:
                    x += 1;
                    break;
                case WEST:
                    x -= 1;
                    break;
            }
    }

    public void moveBackward(){
        switch(direction){
            case NORTH:
                y -= 1;
                break;
            case SOUTH:
                y += 1;
                break;
            case EAST:
                x -= 1;
                break;
            case WEST:
                x += 1;
                break;
        }
    }

    public void turnLeft(){
        int newindex = (direction.ordinal() - 1 + 4) % 4;
        direction = Direction.values()[newindex];
    }

    public void turnRight(){
        int newindex = (direction.ordinal() + 1 + 4) % 4;
        direction = Direction.values()[newindex];
    }
}

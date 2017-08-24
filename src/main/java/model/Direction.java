package model;

public enum Direction {
    North {
        @Override
        public Direction left() {
            return West;
        }

        @Override
        public Direction right() {
            return East;
        }
    },
    South {
        @Override
        public Direction left() {
            return East;
        }

        @Override
        public Direction right() {
            return West;
        }
    },
    East {
        @Override
        public Direction left() {
            return North;
        }

        @Override
        public Direction right() {
            return South;
        }
    },
    West {
        @Override
        public Direction left() {
            return South;
        }

        @Override
        public Direction right() {
            return North;
        }
    };

    public abstract  Direction left();
    public abstract  Direction right();
}

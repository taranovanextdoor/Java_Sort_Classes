public abstract class Sortinger {
    abstract void sort();
    public long sortWithTime(){
        long t_begin = System.currentTimeMillis();
        sort();
        long t_end  = System.currentTimeMillis();
        return t_end- t_begin;
    }
}

public class bit {
    private static boolean bit;

    //DC
    public bit(){
        bit = false;
    }

    //NDC
    public bit(boolean value)
    {
        this.bit = value;
    }

    public void set(boolean value){
        this.bit = value;
    }

    public void toggle(){
        if(this.bit == true)
            this.bit = false;
        else
            this.bit = true;
    }

    public void set(){
        this.bit = true;
    }

    public void clear(){
        this.bit = false;
    }

    public boolean getValue(){
        return this.bit;
    }


    // Was not sure if allowed to use && in if statements as per directions, so done with nested ifs instead.
    // The following methods are coded a bit strangely due to avoidance of logical comparators.
    // Temp bit is used to avoid setting any directly involved variables.
    public bit and(bit other){
        if(this.bit)
        {
            if(other.bit){
                other.set();
            }
        }
        else{
            other.clear();
        }
        return other;
    }

    public bit or(bit other){
        bit temp = new bit();
        if ((this.bit != false)){
            if(other.bit)
            {
                temp.set();
            }
        }
        return temp;
    }

    public bit xor(bit other){

        bit temp = new bit();

        if(this.bit == true)
            if(other.bit == false)
            {
                return this;
            }
        else if(this.bit == false)
            if(other.bit == true)
            {
                return other;
            }
        else if(this.bit == other.bit){
                temp.clear();
            }
        return temp;
    }

    public bit not(){
        if(this.bit){
            this.clear();
        }
        else{
            this.set();
        }
        return this;
    }

    @Override
    public String toString(){
        if(this.bit){
            return "t";
        }
        return "f";
    }
}

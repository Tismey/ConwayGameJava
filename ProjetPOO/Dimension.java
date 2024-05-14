

public class Dimension{
    private int dimension;
    private Dimension[] case;
    private int length;
    private int value;


    public Dimension(int dimension, int index, int[] dimSize){
        this.dimension = dimension;
        length = dimSize[index];
        if(dimension > 0){
            case = new Dimension[length];
            for(int i = 0; i < length; i++){
                case[i] = new Dimension(dimension-1,index+1,dimSize);
            }
        }
    }

    
    public Dimension(int dimension, int length){
        int[] dimsize = new int[dimension];
        for(int i : dimSize) 
            i = length;
        this(dimension,0,dimsize);
    }

    public Dimension getDim(int i){
        return case[i];
    }

    public void SetValue(int val){
        this.value = val;
    }


    public int getValue(int val){
        if(dimension > 0){
            return -1
        }
        return this.value;
    }

    public void SetDim(int i, int value) throw Exception{
        if(dimension != 1){
            throw new Exception("invalid dimesion for Setter");
        }
        case[i].SetValue(value); 
    }

    
}

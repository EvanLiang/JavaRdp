package net.propero.rdp.rdp5.disk;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

import net.propero.rdp.RdpPacket;

public class IRP {

    public int fileId;
    
    public int majorFunction;
    
    public int minorFunction; 

    public DataOutputStream out;
    public ByteArrayOutputStream bout;
    
    public RdpPacket data;
    
    public int deviceId;
    
    public int completionId;
    
    
    public IRP(int fileId, int majorFunction, int minorFunction) {
        super();
        this.fileId = fileId;
        this.majorFunction = majorFunction;
        this.minorFunction = minorFunction;
        
        bout = new ByteArrayOutputStream();
        out = new DataOutputStream(bout);
    }
    
}

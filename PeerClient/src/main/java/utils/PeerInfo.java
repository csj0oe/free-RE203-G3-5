package utils;

public class PeerInfo {
    private final String ip;
    private final int port;

    public PeerInfo(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    public String getIp() {
        return ip;
    }

    public int getPort() {
        return port;
    }
    
}

package jenkins.plugins.htmlaudio;


/**
 * Exposes the plugin-configuration.
 * 
 * @author Lars Hvile
 */
public interface Configuration {
    
    boolean isEnabledByDefault();
    
    String getFailureSoundUrl();

}

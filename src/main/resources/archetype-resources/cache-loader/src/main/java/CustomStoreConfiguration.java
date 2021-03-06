#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};


import java.util.Properties;

import org.infinispan.configuration.cache.AbstractStoreConfiguration;
import org.infinispan.configuration.cache.AsyncStoreConfiguration;
import org.infinispan.configuration.cache.SingletonStoreConfiguration;

public class CustomStoreConfiguration extends AbstractStoreConfiguration {

    public CustomStoreConfiguration(boolean purgeOnStartup,
            boolean fetchPersistentState, boolean ignoreModifications,
            AsyncStoreConfiguration async,
            SingletonStoreConfiguration singletonStore, boolean preload,
            boolean shared, Properties properties) {
        super(purgeOnStartup, fetchPersistentState, ignoreModifications, async,
                singletonStore, preload, shared, properties);
        // TODO Auto-generated constructor stub
    }

}

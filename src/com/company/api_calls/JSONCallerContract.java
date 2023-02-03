package com.company.api_calls;

import com.company.tools.enums.Errors;

/**
 * Whoever wants to use an instantiation of AbstractJSONCaller needs to provide these methods
 */
public interface JSONCallerContract extends APICallerContract {

    /**
     * Returns true if connected to the internet, otherwise false
     * @return True if connected to the internet, otherwise false
     */
    boolean isConnected();

    /**
     * Pops up a window that displays an error message
     * @param error The type of error
     * @param name The name of whoever called this error
     */
    void errorDisplay(final Errors error, final String name);

}

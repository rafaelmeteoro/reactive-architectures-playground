package br.ufs.demos.rxmvp.playground.core.behaviours.errors;

/**
 * Created by bira on 7/5/17.
 */

public class NetworkingError extends RuntimeException {

    public NetworkingError(String message) {
        super(message);
    }

}

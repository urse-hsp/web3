package com.nativernkeeptokenapp.walletconnect.entity;

import com.nativernkeeptokenapp.entity.walletconnect.WCRequest;

/**
 * Created by JB on 6/10/2021.
 */
public interface WalletConnectCallback
{
    boolean receiveRequest(WCRequest request);
}

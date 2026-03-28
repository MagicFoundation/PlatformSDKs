/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.messaging/4 --previous_hash b28416394e6595c08e97c0473855eb05eed1baed --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.messaging-V5-java-source/gen/android/hardware/radio/messaging/IRadioMessaging.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.messaging-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/messaging/IRadioMessaging.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.messaging;
/**
 * This interface is used by telephony and telecom to talk to cellular radio for messaging APIs.
 * All the functions have minimum one parameter:
 * serial: which corresponds to serial no. of request. Serial numbers must only be memorized for the
 * duration of a method call. If clients provide colliding serials (including passing the same
 * serial to different methods), multiple responses (one for each method call) must still be served.
 * setResponseFunctions must work with IRadioMessagingResponse and IRadioMessagingIndication.
 * @hide
 */
public interface IRadioMessaging extends android.os.IInterface
{
  /**
   * The version of this interface that the caller is built against.
   * This might be different from what {@link #getInterfaceVersion()
   * getInterfaceVersion} returns as that is the version of the interface
   * that the remote object is implementing.
   */
  public static final int VERSION = true ? 4 : 5;
  // Interface is being downgraded to the last frozen version due to
  // RELEASE_AIDL_USE_UNFROZEN. See
  // https://source.android.com/docs/core/architecture/aidl/stable-aidl#flag-based-development
  public static final String HASH = "b28416394e6595c08e97c0473855eb05eed1baed";
  /** Default implementation for IRadioMessaging. */
  public static class Default implements android.hardware.radio.messaging.IRadioMessaging
  {
    /**
     * Acknowledge successful or failed receipt of SMS previously indicated via unsol
     * responseNewSms(), including acknowledgement TPDU to send as the RP-User-Data element of the
     * RP-ACK or RP-ERROR PDU.
     * 
     * @param serial Serial number of request.
     * @param success true on successful receipt (send RP-ACK)
     *        false on failed receipt (send RP-ERROR)
     * @param ackPdu acknowledgement TPDU in hexadecimal format
     * 
     * Response function is IRadioMessagingResponse.acknowledgeIncomingGsmSmsWithPduResponse()
     * 
     * This is available when android.hardware.telephony.messaging is defined.
     */
    @Override public void acknowledgeIncomingGsmSmsWithPdu(int serial, boolean success, java.lang.String ackPdu) throws android.os.RemoteException
    {
    }
    /**
     * Acknowledge the success or failure in the receipt of SMS previously indicated
     * via responseCdmaNewSms()
     * 
     * @param serial Serial number of request.
     * @param smsAck Cdma Sms ack to be sent described by CdmaSmsAck
     * 
     * Response function is IRadioMessagingResponse.acknowledgeLastIncomingCdmaSmsResponse()
     * 
     * This is available when android.hardware.telephony.cdma is defined.
     * 
     * @deprecated Legacy CDMA is unsupported.
     */
    @Override public void acknowledgeLastIncomingCdmaSms(int serial, android.hardware.radio.messaging.CdmaSmsAck smsAck) throws android.os.RemoteException
    {
    }
    /**
     * Acknowledge successful or failed receipt of SMS previously indicated via unsolResponseNewSms
     * 
     * @param serial Serial number of request.
     * @param success is true on successful receipt
     *        (basically, AT+CNMA=1 from TS 27.005 is 0 on failed receipt
     *        (basically, AT+CNMA=2 from TS 27.005)
     * @param cause: if success is false, this contains the failure cause as defined
     *        in TS 23.040, 9.2.3.22.
     * 
     * Response function is IRadioMessagingResponse.acknowledgeLastIncomingGsmSmsResponse()
     * 
     * This is available when android.hardware.telephony.messaging is defined.
     */
    @Override public void acknowledgeLastIncomingGsmSms(int serial, boolean success, int cause) throws android.os.RemoteException
    {
    }
    /**
     * Deletes a CDMA SMS message from RUIM memory.
     * 
     * @param serial Serial number of request.
     * @param index record index of the message to delete
     * 
     * Response function is IRadioMessagingResponse.deleteSmsOnRuimResponse()
     * 
     * This is available when android.hardware.telephony.cdma is defined.
     * 
     * @deprecated Legacy CDMA is unsupported.
     */
    @Override public void deleteSmsOnRuim(int serial, int index) throws android.os.RemoteException
    {
    }
    /**
     * Deletes a SMS message from SIM memory.
     * 
     * @param serial Serial number of request.
     * @param index Record index of the message to delete.
     * 
     * Response function is IRadioMessagingResponse.deleteSmsOnSimResponse()
     * 
     * This is available when android.hardware.telephony.messaging is defined.
     */
    @Override public void deleteSmsOnSim(int serial, int index) throws android.os.RemoteException
    {
    }
    /**
     * Request the setting of CDMA Broadcast SMS config
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioMessagingResponse.getCdmaBroadcastConfigResponse()
     * 
     * This is available when android.hardware.telephony.cdma is defined.
     * 
     * @deprecated Legacy CDMA is unsupported.
     */
    @Override public void getCdmaBroadcastConfig(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Request the setting of GSM/WCDMA Cell Broadcast SMS config.
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioMessagingResponse.getGsmBroadcastConfigResponse()
     * 
     * This is available when android.hardware.telephony.messaging is defined.
     */
    @Override public void getGsmBroadcastConfig(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Get the default Short Message Service Center address on the device.
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioMessagingResponse.getSmscAddressResponse()
     * 
     * This is available when android.hardware.telephony.messaging is defined.
     */
    @Override public void getSmscAddress(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Indicates whether there is storage available for new SMS messages.
     * 
     * @param serial Serial number of request.
     * @param available true if memory is available for storing new messages,
     *        false if memory capacity is exceeded
     * 
     * Response function is IRadioMessagingResponse.reportSmsMemoryStatusResponse()
     * 
     * This is available when android.hardware.telephony.messaging is defined.
     */
    @Override public void reportSmsMemoryStatus(int serial, boolean available) throws android.os.RemoteException
    {
    }
    /**
     * When response type received from a radio indication or radio response is
     * RadioIndicationType:UNSOLICITED_ACK_EXP or RadioResponseType:SOLICITED_ACK_EXP respectively,
     * acknowledge the receipt of those messages by sending responseAcknowledgement().
     * 
     * This is available when android.hardware.telephony.messaging is defined.
     */
    @Override public void responseAcknowledgement() throws android.os.RemoteException
    {
    }
    /**
     * Send a CDMA SMS message
     * 
     * @param serial Serial number of request.
     * @param sms CdmaSmsMessage to be sent
     * 
     * Response function is IRadioMessagingResponse.sendCdmaSmsResponse()
     * 
     * This is available when android.hardware.telephony.cdma is defined.
     * 
     * @deprecated Legacy CDMA is unsupported.
     */
    @Override public void sendCdmaSms(int serial, android.hardware.radio.messaging.CdmaSmsMessage sms) throws android.os.RemoteException
    {
    }
    /**
     * Send an SMS message. Identical to sendCdmaSms, except that more messages are expected to be
     * sent soon.
     * 
     * @param serial Serial number of request.
     * @param sms CdmaSmsMessage to be sent
     * 
     * Response function is IRadioMessagingResponse.sendCdmaSmsExpectMoreResponse()
     * 
     * This is available when android.hardware.telephony.cdma is defined.
     * 
     * @deprecated Legacy CDMA is unsupported.
     */
    @Override public void sendCdmaSmsExpectMore(int serial, android.hardware.radio.messaging.CdmaSmsMessage sms) throws android.os.RemoteException
    {
    }
    /**
     * Send a SMS message over IMS. Based on the return error, caller decides to resend if sending
     * sms fails. SMS_SEND_FAIL_RETRY means retry, and other errors means no retry.
     * In case of retry, data is encoded based on Voice Technology available.
     * 
     * @param serial Serial number of request.
     * @param message ImsSmsMessage to be sent
     * 
     * Response function is IRadioMessagingResponse.sendImsSmsResponse()
     * 
     * This is available when android.hardware.telephony.ims is defined.
     */
    @Override public void sendImsSms(int serial, android.hardware.radio.messaging.ImsSmsMessage message) throws android.os.RemoteException
    {
    }
    /**
     * Send an SMS message. Based on the returned error, caller decides to resend if sending sms
     * fails. RadioError:SMS_SEND_FAIL_RETRY means retry (i.e. error cause is 332) and
     * RadioError:GENERIC_FAILURE means no retry (i.e. error cause is 500)
     * 
     * @param serial Serial number of request.
     * @param message GsmSmsMessage to be sent
     * 
     * Response function is IRadioMessagingResponse.sendSmsResponse()
     * 
     * This is available when android.hardware.telephony.messaging is defined.
     */
    @Override public void sendSms(int serial, android.hardware.radio.messaging.GsmSmsMessage message) throws android.os.RemoteException
    {
    }
    /**
     * Send an SMS message. Identical to sendSms, except that more messages are expected to be sent
     * soon. If possible, keep SMS relay protocol link open (eg TS 27.005 AT+CMMS command).
     * Based on the return error, caller decides to resend if sending sms fails.
     * RadioError:SMS_SEND_FAIL_RETRY means retry (i.e. error cause is 332) and
     * RadioError:GENERIC_FAILURE means no retry (i.e. error cause is 500)
     * 
     * @param serial Serial number of request.
     * @param message GsmSmsMessage to be sent
     * 
     * Response function is IRadioMessagingResponse.sendSmsExpectMoreResponse()
     * 
     * This is available when android.hardware.telephony.messaging is defined.
     */
    @Override public void sendSmsExpectMore(int serial, android.hardware.radio.messaging.GsmSmsMessage message) throws android.os.RemoteException
    {
    }
    /**
     * Enable or disable the reception of CDMA Cell Broadcast SMS
     * 
     * @param serial Serial number of request.
     * @param activate indicates to activate or turn off the reception of CDMA Cell Broadcast SMS.
     *        true = activate, false = turn off
     * 
     * Response function is IRadioMessagingResponse.setCdmaBroadcastActivationResponse()
     * 
     * This is available when android.hardware.telephony.cdma is defined.
     * 
     * @deprecated Legacy CDMA is unsupported.
     */
    @Override public void setCdmaBroadcastActivation(int serial, boolean activate) throws android.os.RemoteException
    {
    }
    /**
     * Set CDMA Broadcast SMS config
     * 
     * @param serial Serial number of request.
     * @param configInfo CDMA Broadcast SMS config to be set.
     * 
     * Response function is IRadioMessagingResponse.setCdmaBroadcastConfigResponse()
     * 
     * This is available when android.hardware.telephony.cdma is defined.
     * 
     * @deprecated Legacy CDMA is unsupported.
     */
    @Override public void setCdmaBroadcastConfig(int serial, android.hardware.radio.messaging.CdmaBroadcastSmsConfigInfo[] configInfo) throws android.os.RemoteException
    {
    }
    /**
     * Enable or disable the reception of GSM/WCDMA Cell Broadcast SMS
     * 
     * @param serial Serial number of request.
     * @param activate indicates to activate or turn off the reception of GSM/WCDMA
     *        Cell Broadcast SMS. true = activate, false = turn off
     * 
     * Response function is IRadioMessagingResponse.setGsmBroadcastActivationResponse()
     * 
     * This is available when android.hardware.telephony.messaging is defined.
     */
    @Override public void setGsmBroadcastActivation(int serial, boolean activate) throws android.os.RemoteException
    {
    }
    /**
     * Set GSM/WCDMA Cell Broadcast SMS config
     * 
     * @param serial Serial number of request.
     * @param configInfo Setting of GSM/WCDMA Cell broadcast config
     * 
     * Response function is IRadioMessagingResponse.setGsmBroadcastConfigResponse()
     * 
     * This is available when android.hardware.telephony.messaging is defined.
     */
    @Override public void setGsmBroadcastConfig(int serial, android.hardware.radio.messaging.GsmBroadcastSmsConfigInfo[] configInfo) throws android.os.RemoteException
    {
    }
    /**
     * Set response functions for messaging radio requests and indications.
     * 
     * @param radioMessagingResponse Object containing response functions
     * @param radioMessagingIndication Object containing radio indications
     * 
     * This is available when android.hardware.telephony.messaging is defined.
     */
    @Override public void setResponseFunctions(android.hardware.radio.messaging.IRadioMessagingResponse radioMessagingResponse, android.hardware.radio.messaging.IRadioMessagingIndication radioMessagingIndication) throws android.os.RemoteException
    {
    }
    /**
     * Set the default Short Message Service Center address on the device.
     * 
     * @param serial Serial number of request.
     * @param smsc Short Message Service Center address to set
     * 
     * Response function is IRadioMessagingResponse.setSmscAddressResponse()
     * 
     * This is available when android.hardware.telephony.messaging is defined.
     */
    @Override public void setSmscAddress(int serial, java.lang.String smsc) throws android.os.RemoteException
    {
    }
    /**
     * Stores a CDMA SMS message to RUIM memory.
     * 
     * @param serial Serial number of request.
     * @param cdmaSms CdmaSmsWriteArgs
     * 
     * Response function is IRadioMessagingResponse.writeSmsToRuimResponse()
     * 
     * This is available when android.hardware.telephony.cdma is defined.
     * 
     * @deprecated Legacy CDMA is unsupported.
     */
    @Override public void writeSmsToRuim(int serial, android.hardware.radio.messaging.CdmaSmsWriteArgs cdmaSms) throws android.os.RemoteException
    {
    }
    /**
     * Stores a SMS message to SIM memory.
     * 
     * @param serial Serial number of request.
     * @param smsWriteArgs SmsWriteArgs
     * 
     * Response function is IRadioMessagingResponse.writeSmsToSimResponse()
     * 
     * This is available when android.hardware.telephony.messaging is defined.
     */
    @Override public void writeSmsToSim(int serial, android.hardware.radio.messaging.SmsWriteArgs smsWriteArgs) throws android.os.RemoteException
    {
    }
    @Override
    public int getInterfaceVersion() {
      return 0;
    }
    @Override
    public String getInterfaceHash() {
      return "";
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.hardware.radio.messaging.IRadioMessaging
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.radio.messaging.IRadioMessaging interface,
     * generating a proxy if needed.
     */
    public static android.hardware.radio.messaging.IRadioMessaging asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.radio.messaging.IRadioMessaging))) {
        return ((android.hardware.radio.messaging.IRadioMessaging)iin);
      }
      return new android.hardware.radio.messaging.IRadioMessaging.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(descriptor);
      }
      if (code == INTERFACE_TRANSACTION) {
        reply.writeString(descriptor);
        return true;
      }
      else if (code == TRANSACTION_getInterfaceVersion) {
        reply.writeNoException();
        reply.writeInt(getInterfaceVersion());
        return true;
      }
      else if (code == TRANSACTION_getInterfaceHash) {
        reply.writeNoException();
        reply.writeString(getInterfaceHash());
        return true;
      }
      switch (code)
      {
        case TRANSACTION_acknowledgeIncomingGsmSmsWithPdu:
        {
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = data.readBoolean();
          java.lang.String _arg2;
          _arg2 = data.readString();
          data.enforceNoDataAvail();
          this.acknowledgeIncomingGsmSmsWithPdu(_arg0, _arg1, _arg2);
          break;
        }
        case TRANSACTION_acknowledgeLastIncomingCdmaSms:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.messaging.CdmaSmsAck _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.messaging.CdmaSmsAck.CREATOR);
          data.enforceNoDataAvail();
          this.acknowledgeLastIncomingCdmaSms(_arg0, _arg1);
          break;
        }
        case TRANSACTION_acknowledgeLastIncomingGsmSms:
        {
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = data.readBoolean();
          int _arg2;
          _arg2 = data.readInt();
          data.enforceNoDataAvail();
          this.acknowledgeLastIncomingGsmSms(_arg0, _arg1, _arg2);
          break;
        }
        case TRANSACTION_deleteSmsOnRuim:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.deleteSmsOnRuim(_arg0, _arg1);
          break;
        }
        case TRANSACTION_deleteSmsOnSim:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.deleteSmsOnSim(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getCdmaBroadcastConfig:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getCdmaBroadcastConfig(_arg0);
          break;
        }
        case TRANSACTION_getGsmBroadcastConfig:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getGsmBroadcastConfig(_arg0);
          break;
        }
        case TRANSACTION_getSmscAddress:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getSmscAddress(_arg0);
          break;
        }
        case TRANSACTION_reportSmsMemoryStatus:
        {
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.reportSmsMemoryStatus(_arg0, _arg1);
          break;
        }
        case TRANSACTION_responseAcknowledgement:
        {
          this.responseAcknowledgement();
          break;
        }
        case TRANSACTION_sendCdmaSms:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.messaging.CdmaSmsMessage _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.messaging.CdmaSmsMessage.CREATOR);
          data.enforceNoDataAvail();
          this.sendCdmaSms(_arg0, _arg1);
          break;
        }
        case TRANSACTION_sendCdmaSmsExpectMore:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.messaging.CdmaSmsMessage _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.messaging.CdmaSmsMessage.CREATOR);
          data.enforceNoDataAvail();
          this.sendCdmaSmsExpectMore(_arg0, _arg1);
          break;
        }
        case TRANSACTION_sendImsSms:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.messaging.ImsSmsMessage _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.messaging.ImsSmsMessage.CREATOR);
          data.enforceNoDataAvail();
          this.sendImsSms(_arg0, _arg1);
          break;
        }
        case TRANSACTION_sendSms:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.messaging.GsmSmsMessage _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.messaging.GsmSmsMessage.CREATOR);
          data.enforceNoDataAvail();
          this.sendSms(_arg0, _arg1);
          break;
        }
        case TRANSACTION_sendSmsExpectMore:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.messaging.GsmSmsMessage _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.messaging.GsmSmsMessage.CREATOR);
          data.enforceNoDataAvail();
          this.sendSmsExpectMore(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setCdmaBroadcastActivation:
        {
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.setCdmaBroadcastActivation(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setCdmaBroadcastConfig:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.messaging.CdmaBroadcastSmsConfigInfo[] _arg1;
          _arg1 = data.createTypedArray(android.hardware.radio.messaging.CdmaBroadcastSmsConfigInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setCdmaBroadcastConfig(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setGsmBroadcastActivation:
        {
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.setGsmBroadcastActivation(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setGsmBroadcastConfig:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.messaging.GsmBroadcastSmsConfigInfo[] _arg1;
          _arg1 = data.createTypedArray(android.hardware.radio.messaging.GsmBroadcastSmsConfigInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setGsmBroadcastConfig(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setResponseFunctions:
        {
          android.hardware.radio.messaging.IRadioMessagingResponse _arg0;
          _arg0 = android.hardware.radio.messaging.IRadioMessagingResponse.Stub.asInterface(data.readStrongBinder());
          android.hardware.radio.messaging.IRadioMessagingIndication _arg1;
          _arg1 = android.hardware.radio.messaging.IRadioMessagingIndication.Stub.asInterface(data.readStrongBinder());
          data.enforceNoDataAvail();
          this.setResponseFunctions(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setSmscAddress:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          data.enforceNoDataAvail();
          this.setSmscAddress(_arg0, _arg1);
          break;
        }
        case TRANSACTION_writeSmsToRuim:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.messaging.CdmaSmsWriteArgs _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.messaging.CdmaSmsWriteArgs.CREATOR);
          data.enforceNoDataAvail();
          this.writeSmsToRuim(_arg0, _arg1);
          break;
        }
        case TRANSACTION_writeSmsToSim:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.messaging.SmsWriteArgs _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.messaging.SmsWriteArgs.CREATOR);
          data.enforceNoDataAvail();
          this.writeSmsToSim(_arg0, _arg1);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements android.hardware.radio.messaging.IRadioMessaging
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      private int mCachedVersion = -1;
      private String mCachedHash = "-1";
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      /**
       * Acknowledge successful or failed receipt of SMS previously indicated via unsol
       * responseNewSms(), including acknowledgement TPDU to send as the RP-User-Data element of the
       * RP-ACK or RP-ERROR PDU.
       * 
       * @param serial Serial number of request.
       * @param success true on successful receipt (send RP-ACK)
       *        false on failed receipt (send RP-ERROR)
       * @param ackPdu acknowledgement TPDU in hexadecimal format
       * 
       * Response function is IRadioMessagingResponse.acknowledgeIncomingGsmSmsWithPduResponse()
       * 
       * This is available when android.hardware.telephony.messaging is defined.
       */
      @Override public void acknowledgeIncomingGsmSmsWithPdu(int serial, boolean success, java.lang.String ackPdu) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeBoolean(success);
          _data.writeString(ackPdu);
          boolean _status = mRemote.transact(Stub.TRANSACTION_acknowledgeIncomingGsmSmsWithPdu, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method acknowledgeIncomingGsmSmsWithPdu is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Acknowledge the success or failure in the receipt of SMS previously indicated
       * via responseCdmaNewSms()
       * 
       * @param serial Serial number of request.
       * @param smsAck Cdma Sms ack to be sent described by CdmaSmsAck
       * 
       * Response function is IRadioMessagingResponse.acknowledgeLastIncomingCdmaSmsResponse()
       * 
       * This is available when android.hardware.telephony.cdma is defined.
       * 
       * @deprecated Legacy CDMA is unsupported.
       */
      @Override public void acknowledgeLastIncomingCdmaSms(int serial, android.hardware.radio.messaging.CdmaSmsAck smsAck) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedObject(smsAck, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_acknowledgeLastIncomingCdmaSms, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method acknowledgeLastIncomingCdmaSms is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Acknowledge successful or failed receipt of SMS previously indicated via unsolResponseNewSms
       * 
       * @param serial Serial number of request.
       * @param success is true on successful receipt
       *        (basically, AT+CNMA=1 from TS 27.005 is 0 on failed receipt
       *        (basically, AT+CNMA=2 from TS 27.005)
       * @param cause: if success is false, this contains the failure cause as defined
       *        in TS 23.040, 9.2.3.22.
       * 
       * Response function is IRadioMessagingResponse.acknowledgeLastIncomingGsmSmsResponse()
       * 
       * This is available when android.hardware.telephony.messaging is defined.
       */
      @Override public void acknowledgeLastIncomingGsmSms(int serial, boolean success, int cause) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeBoolean(success);
          _data.writeInt(cause);
          boolean _status = mRemote.transact(Stub.TRANSACTION_acknowledgeLastIncomingGsmSms, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method acknowledgeLastIncomingGsmSms is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Deletes a CDMA SMS message from RUIM memory.
       * 
       * @param serial Serial number of request.
       * @param index record index of the message to delete
       * 
       * Response function is IRadioMessagingResponse.deleteSmsOnRuimResponse()
       * 
       * This is available when android.hardware.telephony.cdma is defined.
       * 
       * @deprecated Legacy CDMA is unsupported.
       */
      @Override public void deleteSmsOnRuim(int serial, int index) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(index);
          boolean _status = mRemote.transact(Stub.TRANSACTION_deleteSmsOnRuim, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method deleteSmsOnRuim is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Deletes a SMS message from SIM memory.
       * 
       * @param serial Serial number of request.
       * @param index Record index of the message to delete.
       * 
       * Response function is IRadioMessagingResponse.deleteSmsOnSimResponse()
       * 
       * This is available when android.hardware.telephony.messaging is defined.
       */
      @Override public void deleteSmsOnSim(int serial, int index) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(index);
          boolean _status = mRemote.transact(Stub.TRANSACTION_deleteSmsOnSim, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method deleteSmsOnSim is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Request the setting of CDMA Broadcast SMS config
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioMessagingResponse.getCdmaBroadcastConfigResponse()
       * 
       * This is available when android.hardware.telephony.cdma is defined.
       * 
       * @deprecated Legacy CDMA is unsupported.
       */
      @Override public void getCdmaBroadcastConfig(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCdmaBroadcastConfig, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getCdmaBroadcastConfig is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Request the setting of GSM/WCDMA Cell Broadcast SMS config.
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioMessagingResponse.getGsmBroadcastConfigResponse()
       * 
       * This is available when android.hardware.telephony.messaging is defined.
       */
      @Override public void getGsmBroadcastConfig(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getGsmBroadcastConfig, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getGsmBroadcastConfig is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Get the default Short Message Service Center address on the device.
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioMessagingResponse.getSmscAddressResponse()
       * 
       * This is available when android.hardware.telephony.messaging is defined.
       */
      @Override public void getSmscAddress(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSmscAddress, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getSmscAddress is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates whether there is storage available for new SMS messages.
       * 
       * @param serial Serial number of request.
       * @param available true if memory is available for storing new messages,
       *        false if memory capacity is exceeded
       * 
       * Response function is IRadioMessagingResponse.reportSmsMemoryStatusResponse()
       * 
       * This is available when android.hardware.telephony.messaging is defined.
       */
      @Override public void reportSmsMemoryStatus(int serial, boolean available) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeBoolean(available);
          boolean _status = mRemote.transact(Stub.TRANSACTION_reportSmsMemoryStatus, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method reportSmsMemoryStatus is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * When response type received from a radio indication or radio response is
       * RadioIndicationType:UNSOLICITED_ACK_EXP or RadioResponseType:SOLICITED_ACK_EXP respectively,
       * acknowledge the receipt of those messages by sending responseAcknowledgement().
       * 
       * This is available when android.hardware.telephony.messaging is defined.
       */
      @Override public void responseAcknowledgement() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_responseAcknowledgement, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method responseAcknowledgement is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Send a CDMA SMS message
       * 
       * @param serial Serial number of request.
       * @param sms CdmaSmsMessage to be sent
       * 
       * Response function is IRadioMessagingResponse.sendCdmaSmsResponse()
       * 
       * This is available when android.hardware.telephony.cdma is defined.
       * 
       * @deprecated Legacy CDMA is unsupported.
       */
      @Override public void sendCdmaSms(int serial, android.hardware.radio.messaging.CdmaSmsMessage sms) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedObject(sms, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendCdmaSms, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method sendCdmaSms is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Send an SMS message. Identical to sendCdmaSms, except that more messages are expected to be
       * sent soon.
       * 
       * @param serial Serial number of request.
       * @param sms CdmaSmsMessage to be sent
       * 
       * Response function is IRadioMessagingResponse.sendCdmaSmsExpectMoreResponse()
       * 
       * This is available when android.hardware.telephony.cdma is defined.
       * 
       * @deprecated Legacy CDMA is unsupported.
       */
      @Override public void sendCdmaSmsExpectMore(int serial, android.hardware.radio.messaging.CdmaSmsMessage sms) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedObject(sms, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendCdmaSmsExpectMore, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method sendCdmaSmsExpectMore is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Send a SMS message over IMS. Based on the return error, caller decides to resend if sending
       * sms fails. SMS_SEND_FAIL_RETRY means retry, and other errors means no retry.
       * In case of retry, data is encoded based on Voice Technology available.
       * 
       * @param serial Serial number of request.
       * @param message ImsSmsMessage to be sent
       * 
       * Response function is IRadioMessagingResponse.sendImsSmsResponse()
       * 
       * This is available when android.hardware.telephony.ims is defined.
       */
      @Override public void sendImsSms(int serial, android.hardware.radio.messaging.ImsSmsMessage message) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedObject(message, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendImsSms, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method sendImsSms is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Send an SMS message. Based on the returned error, caller decides to resend if sending sms
       * fails. RadioError:SMS_SEND_FAIL_RETRY means retry (i.e. error cause is 332) and
       * RadioError:GENERIC_FAILURE means no retry (i.e. error cause is 500)
       * 
       * @param serial Serial number of request.
       * @param message GsmSmsMessage to be sent
       * 
       * Response function is IRadioMessagingResponse.sendSmsResponse()
       * 
       * This is available when android.hardware.telephony.messaging is defined.
       */
      @Override public void sendSms(int serial, android.hardware.radio.messaging.GsmSmsMessage message) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedObject(message, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendSms, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method sendSms is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Send an SMS message. Identical to sendSms, except that more messages are expected to be sent
       * soon. If possible, keep SMS relay protocol link open (eg TS 27.005 AT+CMMS command).
       * Based on the return error, caller decides to resend if sending sms fails.
       * RadioError:SMS_SEND_FAIL_RETRY means retry (i.e. error cause is 332) and
       * RadioError:GENERIC_FAILURE means no retry (i.e. error cause is 500)
       * 
       * @param serial Serial number of request.
       * @param message GsmSmsMessage to be sent
       * 
       * Response function is IRadioMessagingResponse.sendSmsExpectMoreResponse()
       * 
       * This is available when android.hardware.telephony.messaging is defined.
       */
      @Override public void sendSmsExpectMore(int serial, android.hardware.radio.messaging.GsmSmsMessage message) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedObject(message, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendSmsExpectMore, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method sendSmsExpectMore is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Enable or disable the reception of CDMA Cell Broadcast SMS
       * 
       * @param serial Serial number of request.
       * @param activate indicates to activate or turn off the reception of CDMA Cell Broadcast SMS.
       *        true = activate, false = turn off
       * 
       * Response function is IRadioMessagingResponse.setCdmaBroadcastActivationResponse()
       * 
       * This is available when android.hardware.telephony.cdma is defined.
       * 
       * @deprecated Legacy CDMA is unsupported.
       */
      @Override public void setCdmaBroadcastActivation(int serial, boolean activate) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeBoolean(activate);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setCdmaBroadcastActivation, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setCdmaBroadcastActivation is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Set CDMA Broadcast SMS config
       * 
       * @param serial Serial number of request.
       * @param configInfo CDMA Broadcast SMS config to be set.
       * 
       * Response function is IRadioMessagingResponse.setCdmaBroadcastConfigResponse()
       * 
       * This is available when android.hardware.telephony.cdma is defined.
       * 
       * @deprecated Legacy CDMA is unsupported.
       */
      @Override public void setCdmaBroadcastConfig(int serial, android.hardware.radio.messaging.CdmaBroadcastSmsConfigInfo[] configInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedArray(configInfo, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setCdmaBroadcastConfig, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setCdmaBroadcastConfig is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Enable or disable the reception of GSM/WCDMA Cell Broadcast SMS
       * 
       * @param serial Serial number of request.
       * @param activate indicates to activate or turn off the reception of GSM/WCDMA
       *        Cell Broadcast SMS. true = activate, false = turn off
       * 
       * Response function is IRadioMessagingResponse.setGsmBroadcastActivationResponse()
       * 
       * This is available when android.hardware.telephony.messaging is defined.
       */
      @Override public void setGsmBroadcastActivation(int serial, boolean activate) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeBoolean(activate);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setGsmBroadcastActivation, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setGsmBroadcastActivation is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Set GSM/WCDMA Cell Broadcast SMS config
       * 
       * @param serial Serial number of request.
       * @param configInfo Setting of GSM/WCDMA Cell broadcast config
       * 
       * Response function is IRadioMessagingResponse.setGsmBroadcastConfigResponse()
       * 
       * This is available when android.hardware.telephony.messaging is defined.
       */
      @Override public void setGsmBroadcastConfig(int serial, android.hardware.radio.messaging.GsmBroadcastSmsConfigInfo[] configInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedArray(configInfo, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setGsmBroadcastConfig, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setGsmBroadcastConfig is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Set response functions for messaging radio requests and indications.
       * 
       * @param radioMessagingResponse Object containing response functions
       * @param radioMessagingIndication Object containing radio indications
       * 
       * This is available when android.hardware.telephony.messaging is defined.
       */
      @Override public void setResponseFunctions(android.hardware.radio.messaging.IRadioMessagingResponse radioMessagingResponse, android.hardware.radio.messaging.IRadioMessagingIndication radioMessagingIndication) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(radioMessagingResponse);
          _data.writeStrongInterface(radioMessagingIndication);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setResponseFunctions, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setResponseFunctions is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Set the default Short Message Service Center address on the device.
       * 
       * @param serial Serial number of request.
       * @param smsc Short Message Service Center address to set
       * 
       * Response function is IRadioMessagingResponse.setSmscAddressResponse()
       * 
       * This is available when android.hardware.telephony.messaging is defined.
       */
      @Override public void setSmscAddress(int serial, java.lang.String smsc) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeString(smsc);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setSmscAddress, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setSmscAddress is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Stores a CDMA SMS message to RUIM memory.
       * 
       * @param serial Serial number of request.
       * @param cdmaSms CdmaSmsWriteArgs
       * 
       * Response function is IRadioMessagingResponse.writeSmsToRuimResponse()
       * 
       * This is available when android.hardware.telephony.cdma is defined.
       * 
       * @deprecated Legacy CDMA is unsupported.
       */
      @Override public void writeSmsToRuim(int serial, android.hardware.radio.messaging.CdmaSmsWriteArgs cdmaSms) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedObject(cdmaSms, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_writeSmsToRuim, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method writeSmsToRuim is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Stores a SMS message to SIM memory.
       * 
       * @param serial Serial number of request.
       * @param smsWriteArgs SmsWriteArgs
       * 
       * Response function is IRadioMessagingResponse.writeSmsToSimResponse()
       * 
       * This is available when android.hardware.telephony.messaging is defined.
       */
      @Override public void writeSmsToSim(int serial, android.hardware.radio.messaging.SmsWriteArgs smsWriteArgs) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedObject(smsWriteArgs, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_writeSmsToSim, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method writeSmsToSim is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override
      public int getInterfaceVersion() throws android.os.RemoteException {
        if (mCachedVersion == -1) {
          android.os.Parcel data = android.os.Parcel.obtain(asBinder());
          android.os.Parcel reply = android.os.Parcel.obtain();
          try {
            data.writeInterfaceToken(DESCRIPTOR);
            boolean _status = mRemote.transact(Stub.TRANSACTION_getInterfaceVersion, data, reply, 0);
            reply.readException();
            mCachedVersion = reply.readInt();
          } finally {
            reply.recycle();
            data.recycle();
          }
        }
        return mCachedVersion;
      }
      @Override
      public synchronized String getInterfaceHash() throws android.os.RemoteException {
        if ("-1".equals(mCachedHash)) {
          android.os.Parcel data = android.os.Parcel.obtain(asBinder());
          android.os.Parcel reply = android.os.Parcel.obtain();
          try {
            data.writeInterfaceToken(DESCRIPTOR);
            boolean _status = mRemote.transact(Stub.TRANSACTION_getInterfaceHash, data, reply, 0);
            reply.readException();
            mCachedHash = reply.readString();
          } finally {
            reply.recycle();
            data.recycle();
          }
        }
        return mCachedHash;
      }
    }
    static final int TRANSACTION_acknowledgeIncomingGsmSmsWithPdu = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_acknowledgeLastIncomingCdmaSms = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_acknowledgeLastIncomingGsmSms = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_deleteSmsOnRuim = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_deleteSmsOnSim = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_getCdmaBroadcastConfig = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_getGsmBroadcastConfig = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_getSmscAddress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_reportSmsMemoryStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_responseAcknowledgement = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_sendCdmaSms = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_sendCdmaSmsExpectMore = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_sendImsSms = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_sendSms = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_sendSmsExpectMore = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_setCdmaBroadcastActivation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_setCdmaBroadcastConfig = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_setGsmBroadcastActivation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_setGsmBroadcastConfig = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_setResponseFunctions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_setSmscAddress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_writeSmsToRuim = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_writeSmsToSim = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_getInterfaceVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777214);
    static final int TRANSACTION_getInterfaceHash = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777213);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$radio$messaging$IRadioMessaging".replace('$', '.');
  /**
   * Acknowledge successful or failed receipt of SMS previously indicated via unsol
   * responseNewSms(), including acknowledgement TPDU to send as the RP-User-Data element of the
   * RP-ACK or RP-ERROR PDU.
   * 
   * @param serial Serial number of request.
   * @param success true on successful receipt (send RP-ACK)
   *        false on failed receipt (send RP-ERROR)
   * @param ackPdu acknowledgement TPDU in hexadecimal format
   * 
   * Response function is IRadioMessagingResponse.acknowledgeIncomingGsmSmsWithPduResponse()
   * 
   * This is available when android.hardware.telephony.messaging is defined.
   */
  public void acknowledgeIncomingGsmSmsWithPdu(int serial, boolean success, java.lang.String ackPdu) throws android.os.RemoteException;
  /**
   * Acknowledge the success or failure in the receipt of SMS previously indicated
   * via responseCdmaNewSms()
   * 
   * @param serial Serial number of request.
   * @param smsAck Cdma Sms ack to be sent described by CdmaSmsAck
   * 
   * Response function is IRadioMessagingResponse.acknowledgeLastIncomingCdmaSmsResponse()
   * 
   * This is available when android.hardware.telephony.cdma is defined.
   * 
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public void acknowledgeLastIncomingCdmaSms(int serial, android.hardware.radio.messaging.CdmaSmsAck smsAck) throws android.os.RemoteException;
  /**
   * Acknowledge successful or failed receipt of SMS previously indicated via unsolResponseNewSms
   * 
   * @param serial Serial number of request.
   * @param success is true on successful receipt
   *        (basically, AT+CNMA=1 from TS 27.005 is 0 on failed receipt
   *        (basically, AT+CNMA=2 from TS 27.005)
   * @param cause: if success is false, this contains the failure cause as defined
   *        in TS 23.040, 9.2.3.22.
   * 
   * Response function is IRadioMessagingResponse.acknowledgeLastIncomingGsmSmsResponse()
   * 
   * This is available when android.hardware.telephony.messaging is defined.
   */
  public void acknowledgeLastIncomingGsmSms(int serial, boolean success, int cause) throws android.os.RemoteException;
  /**
   * Deletes a CDMA SMS message from RUIM memory.
   * 
   * @param serial Serial number of request.
   * @param index record index of the message to delete
   * 
   * Response function is IRadioMessagingResponse.deleteSmsOnRuimResponse()
   * 
   * This is available when android.hardware.telephony.cdma is defined.
   * 
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public void deleteSmsOnRuim(int serial, int index) throws android.os.RemoteException;
  /**
   * Deletes a SMS message from SIM memory.
   * 
   * @param serial Serial number of request.
   * @param index Record index of the message to delete.
   * 
   * Response function is IRadioMessagingResponse.deleteSmsOnSimResponse()
   * 
   * This is available when android.hardware.telephony.messaging is defined.
   */
  public void deleteSmsOnSim(int serial, int index) throws android.os.RemoteException;
  /**
   * Request the setting of CDMA Broadcast SMS config
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioMessagingResponse.getCdmaBroadcastConfigResponse()
   * 
   * This is available when android.hardware.telephony.cdma is defined.
   * 
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public void getCdmaBroadcastConfig(int serial) throws android.os.RemoteException;
  /**
   * Request the setting of GSM/WCDMA Cell Broadcast SMS config.
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioMessagingResponse.getGsmBroadcastConfigResponse()
   * 
   * This is available when android.hardware.telephony.messaging is defined.
   */
  public void getGsmBroadcastConfig(int serial) throws android.os.RemoteException;
  /**
   * Get the default Short Message Service Center address on the device.
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioMessagingResponse.getSmscAddressResponse()
   * 
   * This is available when android.hardware.telephony.messaging is defined.
   */
  public void getSmscAddress(int serial) throws android.os.RemoteException;
  /**
   * Indicates whether there is storage available for new SMS messages.
   * 
   * @param serial Serial number of request.
   * @param available true if memory is available for storing new messages,
   *        false if memory capacity is exceeded
   * 
   * Response function is IRadioMessagingResponse.reportSmsMemoryStatusResponse()
   * 
   * This is available when android.hardware.telephony.messaging is defined.
   */
  public void reportSmsMemoryStatus(int serial, boolean available) throws android.os.RemoteException;
  /**
   * When response type received from a radio indication or radio response is
   * RadioIndicationType:UNSOLICITED_ACK_EXP or RadioResponseType:SOLICITED_ACK_EXP respectively,
   * acknowledge the receipt of those messages by sending responseAcknowledgement().
   * 
   * This is available when android.hardware.telephony.messaging is defined.
   */
  public void responseAcknowledgement() throws android.os.RemoteException;
  /**
   * Send a CDMA SMS message
   * 
   * @param serial Serial number of request.
   * @param sms CdmaSmsMessage to be sent
   * 
   * Response function is IRadioMessagingResponse.sendCdmaSmsResponse()
   * 
   * This is available when android.hardware.telephony.cdma is defined.
   * 
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public void sendCdmaSms(int serial, android.hardware.radio.messaging.CdmaSmsMessage sms) throws android.os.RemoteException;
  /**
   * Send an SMS message. Identical to sendCdmaSms, except that more messages are expected to be
   * sent soon.
   * 
   * @param serial Serial number of request.
   * @param sms CdmaSmsMessage to be sent
   * 
   * Response function is IRadioMessagingResponse.sendCdmaSmsExpectMoreResponse()
   * 
   * This is available when android.hardware.telephony.cdma is defined.
   * 
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public void sendCdmaSmsExpectMore(int serial, android.hardware.radio.messaging.CdmaSmsMessage sms) throws android.os.RemoteException;
  /**
   * Send a SMS message over IMS. Based on the return error, caller decides to resend if sending
   * sms fails. SMS_SEND_FAIL_RETRY means retry, and other errors means no retry.
   * In case of retry, data is encoded based on Voice Technology available.
   * 
   * @param serial Serial number of request.
   * @param message ImsSmsMessage to be sent
   * 
   * Response function is IRadioMessagingResponse.sendImsSmsResponse()
   * 
   * This is available when android.hardware.telephony.ims is defined.
   */
  public void sendImsSms(int serial, android.hardware.radio.messaging.ImsSmsMessage message) throws android.os.RemoteException;
  /**
   * Send an SMS message. Based on the returned error, caller decides to resend if sending sms
   * fails. RadioError:SMS_SEND_FAIL_RETRY means retry (i.e. error cause is 332) and
   * RadioError:GENERIC_FAILURE means no retry (i.e. error cause is 500)
   * 
   * @param serial Serial number of request.
   * @param message GsmSmsMessage to be sent
   * 
   * Response function is IRadioMessagingResponse.sendSmsResponse()
   * 
   * This is available when android.hardware.telephony.messaging is defined.
   */
  public void sendSms(int serial, android.hardware.radio.messaging.GsmSmsMessage message) throws android.os.RemoteException;
  /**
   * Send an SMS message. Identical to sendSms, except that more messages are expected to be sent
   * soon. If possible, keep SMS relay protocol link open (eg TS 27.005 AT+CMMS command).
   * Based on the return error, caller decides to resend if sending sms fails.
   * RadioError:SMS_SEND_FAIL_RETRY means retry (i.e. error cause is 332) and
   * RadioError:GENERIC_FAILURE means no retry (i.e. error cause is 500)
   * 
   * @param serial Serial number of request.
   * @param message GsmSmsMessage to be sent
   * 
   * Response function is IRadioMessagingResponse.sendSmsExpectMoreResponse()
   * 
   * This is available when android.hardware.telephony.messaging is defined.
   */
  public void sendSmsExpectMore(int serial, android.hardware.radio.messaging.GsmSmsMessage message) throws android.os.RemoteException;
  /**
   * Enable or disable the reception of CDMA Cell Broadcast SMS
   * 
   * @param serial Serial number of request.
   * @param activate indicates to activate or turn off the reception of CDMA Cell Broadcast SMS.
   *        true = activate, false = turn off
   * 
   * Response function is IRadioMessagingResponse.setCdmaBroadcastActivationResponse()
   * 
   * This is available when android.hardware.telephony.cdma is defined.
   * 
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public void setCdmaBroadcastActivation(int serial, boolean activate) throws android.os.RemoteException;
  /**
   * Set CDMA Broadcast SMS config
   * 
   * @param serial Serial number of request.
   * @param configInfo CDMA Broadcast SMS config to be set.
   * 
   * Response function is IRadioMessagingResponse.setCdmaBroadcastConfigResponse()
   * 
   * This is available when android.hardware.telephony.cdma is defined.
   * 
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public void setCdmaBroadcastConfig(int serial, android.hardware.radio.messaging.CdmaBroadcastSmsConfigInfo[] configInfo) throws android.os.RemoteException;
  /**
   * Enable or disable the reception of GSM/WCDMA Cell Broadcast SMS
   * 
   * @param serial Serial number of request.
   * @param activate indicates to activate or turn off the reception of GSM/WCDMA
   *        Cell Broadcast SMS. true = activate, false = turn off
   * 
   * Response function is IRadioMessagingResponse.setGsmBroadcastActivationResponse()
   * 
   * This is available when android.hardware.telephony.messaging is defined.
   */
  public void setGsmBroadcastActivation(int serial, boolean activate) throws android.os.RemoteException;
  /**
   * Set GSM/WCDMA Cell Broadcast SMS config
   * 
   * @param serial Serial number of request.
   * @param configInfo Setting of GSM/WCDMA Cell broadcast config
   * 
   * Response function is IRadioMessagingResponse.setGsmBroadcastConfigResponse()
   * 
   * This is available when android.hardware.telephony.messaging is defined.
   */
  public void setGsmBroadcastConfig(int serial, android.hardware.radio.messaging.GsmBroadcastSmsConfigInfo[] configInfo) throws android.os.RemoteException;
  /**
   * Set response functions for messaging radio requests and indications.
   * 
   * @param radioMessagingResponse Object containing response functions
   * @param radioMessagingIndication Object containing radio indications
   * 
   * This is available when android.hardware.telephony.messaging is defined.
   */
  public void setResponseFunctions(android.hardware.radio.messaging.IRadioMessagingResponse radioMessagingResponse, android.hardware.radio.messaging.IRadioMessagingIndication radioMessagingIndication) throws android.os.RemoteException;
  /**
   * Set the default Short Message Service Center address on the device.
   * 
   * @param serial Serial number of request.
   * @param smsc Short Message Service Center address to set
   * 
   * Response function is IRadioMessagingResponse.setSmscAddressResponse()
   * 
   * This is available when android.hardware.telephony.messaging is defined.
   */
  public void setSmscAddress(int serial, java.lang.String smsc) throws android.os.RemoteException;
  /**
   * Stores a CDMA SMS message to RUIM memory.
   * 
   * @param serial Serial number of request.
   * @param cdmaSms CdmaSmsWriteArgs
   * 
   * Response function is IRadioMessagingResponse.writeSmsToRuimResponse()
   * 
   * This is available when android.hardware.telephony.cdma is defined.
   * 
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public void writeSmsToRuim(int serial, android.hardware.radio.messaging.CdmaSmsWriteArgs cdmaSms) throws android.os.RemoteException;
  /**
   * Stores a SMS message to SIM memory.
   * 
   * @param serial Serial number of request.
   * @param smsWriteArgs SmsWriteArgs
   * 
   * Response function is IRadioMessagingResponse.writeSmsToSimResponse()
   * 
   * This is available when android.hardware.telephony.messaging is defined.
   */
  public void writeSmsToSim(int serial, android.hardware.radio.messaging.SmsWriteArgs smsWriteArgs) throws android.os.RemoteException;
  public int getInterfaceVersion() throws android.os.RemoteException;
  public String getInterfaceHash() throws android.os.RemoteException;
}

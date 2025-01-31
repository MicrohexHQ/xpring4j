package io.xpring.javascript;

/** Contains JavaScript artifacts of generating a new Wallet. */
public class JavaScriptWalletGenerationResult {
    /** The mnemonic of the newly generated Wallet. */
    private String mnemonic;
    public String getMnemonic() { return mnemonic; }

    /** The derivation path of the newly generated Wallet. */
    private String derivationPath;
    public String getDerivationPath() { return derivationPath; }

    /** The newly generated Wallet. */
    private JavaScriptWallet wallet;
    public JavaScriptWallet getWallet()  { return wallet; }


    public JavaScriptWalletGenerationResult(String mnemonic, String derivationPath, JavaScriptWallet wallet) {
        this.mnemonic = mnemonic;
        this.derivationPath = derivationPath;
        this.wallet = wallet;
    }
}
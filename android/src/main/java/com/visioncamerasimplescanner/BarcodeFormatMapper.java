package com.visioncamerasimplescanner;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

public class BarcodeFormatMapper {

  private static final Map<String, Integer> formatMap = new HashMap<>();

  static {
    formatMap.put("aztec", Barcode.FORMAT_AZTEC);
    formatMap.put("codabar", Barcode.FORMAT_CODABAR);
    formatMap.put("code-39", Barcode.FORMAT_CODE_39);
    formatMap.put("code-93", Barcode.FORMAT_CODE_93);
    formatMap.put("code-128", Barcode.FORMAT_CODE_128);
    formatMap.put("data-matrix", Barcode.FORMAT_DATA_MATRIX);
    formatMap.put("ean-8", Barcode.FORMAT_EAN_8);
    formatMap.put("ean-13", Barcode.FORMAT_EAN_13);
    formatMap.put("itf", Barcode.FORMAT_ITF);
    formatMap.put("pdf-417", Barcode.FORMAT_PDF417);
    formatMap.put("qr", Barcode.FORMAT_QR_CODE);
    formatMap.put("upc-a", Barcode.FORMAT_UPC_A);
    formatMap.put("upc-e", Barcode.FORMAT_UPC_E);
  }

  @Nullable
  public static Integer getFormat(String type) {
    return formatMap.get(type);
  }
}

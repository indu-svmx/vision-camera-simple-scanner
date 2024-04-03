import type { AndroidBarcode } from './android';
import type { Key, Point } from './common';
import type { iOSBarcode, iOSBoundingBox } from './ios';

export type VisionCameraConstants = {
  MODULE_NAME: string;
  BARCODE_TYPES: { [key: string]: number };
  BARCODE_FORMATS: { [key: string]: number };
};

export type BoundingBox = iOSBoundingBox;
export type CornerPoints = Point[];

export type BarcodeType =
  | 'aztec'
  | 'codabar'
  | 'code-128'
  | 'code-39'
  | 'code-93'
  | 'data-matrix'
  | 'ean-13'
  | 'ean-8'
  | 'gs1-databar'
  | 'itf'
  | 'msi-plessey'
  | 'pdf-417'
  | 'qr'
  | 'upc-a'
  | 'upc-e'
  | 'unknown';

export type Barcode = {
  value: string | null;
  type: BarcodeType;
  boundingBox: BoundingBox;
  cornerPoints: CornerPoints;
  native: iOSBarcode | AndroidBarcode;
};

export type Highlight = Barcode & {
  key: Key;
  // Adjusted corners values to scale
  cornerPoints: CornerPoints;
  // Adjusted bounding box value to scale
  boundingBox: BoundingBox;
};

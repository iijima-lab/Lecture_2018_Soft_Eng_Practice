@rem =====================================================
@echo off
@rem =====================================================
@rem run 2013.04.12 iijima@ae.keio.ac.jp
@rem =====================================================
set SRC=src
set DST=classes
@rem =====================================================
title �\�t�g�E�F�A�H�w���K: run %PACKAGE%.%TARGET%
echo  �\�t�g�E�F�A�H�w���K: run %PACKAGE%.%TARGET%
@rem -----------------------------------------------------
if not exist %DST% (
    call 9001-make.bat
)
@rem -----------------------------------------------------
java -cp %DST% %PACKAGE%.%TARGET%
@rem =====================================================
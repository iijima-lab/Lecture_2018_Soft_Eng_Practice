@rem =====================================================
@echo off
@rem =====================================================
@rem make 2013.04.12 iijima@ae.keio.ac.jp
@rem =====================================================
set SRC=src
set DST=classes
@rem =====================================================
title �\�t�g�E�F�A�H�w���K: make %PACKAGE%.%TARGET%
echo  �\�t�g�E�F�A�H�w���K: make %PACKAGE%.%TARGET%
@rem -----------------------------------------------------
if not exist %DST% (
    mkdir %DST%
)
@rem -----------------------------------------------------
javac -d %DST% -cp %DST% -sourcepath %SRC% %SRC%/%PACKAGE%/%TARGET%.java
@rem =====================================================
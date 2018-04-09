@rem =====================================================
@echo off
@rem =====================================================
@rem clean 2013.04.12 iijima@ae.keio.ac.jp
@rem =====================================================
set SRC=src
set DST=classes
@rem =====================================================
if exist %DST% (
    if exist %DST%\\%PACKAGE% (
        del %DST%\\%PACKAGE%\*.class
        rmdir %DST%\\%PACKAGE%
    )
    rmdir %DST%
)
pause
@rem =====================================================

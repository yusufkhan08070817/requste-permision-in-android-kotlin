  fun Requst_permission():Boolean
    {
       if(ActivityCompat.checkSelfPermission(
               this,Manifest.permission.READ_EXTERNAL_STORAGE
           )!=PackageManager.PERMISSION_GRANTED)
       {
           ActivityCompat.requestPermissions(this, arrayOf(READ_EXTERNAL_STORAGE),13)
           return false
       }
        return true
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode==13) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED)
                toas("permison granted")
            else
                ActivityCompat.requestPermissions(this, arrayOf(READ_EXTERNAL_STORAGE),13)
        }

    }

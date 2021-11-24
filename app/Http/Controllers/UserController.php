<?php

namespace App\Http\Controllers;

use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Http\Response;
use Illuminate\Support\Facades\Validator;

class UserController extends Controller
{
    // index, show($id), create(), edit(), delete()
    public function index()
    {
//        $users = [
//            ['id'=>1,'name'=>'Endrit','surname'=>'Germizaj'],
//            ['id'=>2,'name'=>'Abdullah','surname'=>'Salihu'],
//            ['id'=>3,'name'=>'Korab','surname'=>'Krrabaj'],
//            ['id'=>4,'name'=>'Detin','surname'=>'Qipa']
//        ];

        $users = User::all();
        return response($users);
    }

    public function show($id)
    {

        $user = User::findOrFail($id);
        return response($user);
    }

    public function store(Request $request)
    {

        $validated = Validator::make($request->all(), [
            'first_name' => 'required',
            'last_name' => 'required',
            'email' => 'required|unique:users,email',
        ]);
        if ($validated->fails()) {
            return 'problem';
        }

        // $request->input('first_name'), => $_POST['first_name]
        $input = [
            'first_name' => $request->input('first_name'),
            'last_name' => $request->input('last_name'),
            'email' => $request->input('email')
        ];
        $response = User::insert($input);
        if (!$response) {
            return response(['message' => 'error']);
        }
        return response(['message' => 'success']);
    }

    public function update($id,Request $request){

        $update = User::where('id',$id)->update($request->input());
        if(!$update){
            return response(['message' => 'error']);
        }
        return response(['message' => 'success']);
    }

    public function delete($id){

        $delete = User::where('id',$id)->delete();
        if(!$delete){
            return response(['message' => 'error']);
        }
        return response(['message' => 'success']);
    }

}
